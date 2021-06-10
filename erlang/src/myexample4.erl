-module(myexample2).
-compile(export_all).


main() ->
  spawn(fun() -> ping(spawn(fun()->pong(spawn(fun()->right() end))end))end).


ping(PidPong) ->
  PidPong ! {ping, self()},

  receive
    pong -> io:format("ok!~n")
  end.


pong(PidRight) ->

  receive
    {ping, PidPing} -> PidRight ! {right, self()},
      receive
        right -> PidPing ! pong
      end
  end.


right() ->
  receive
    {right, PidPong} -> PidPong ! left
  end.
