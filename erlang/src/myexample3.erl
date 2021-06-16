-module(myexample3).
-compile(export_all).


%%
% right "забыл" отправить сообщение назад
%
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
    %{right, PidPong} -> PidPong ! right
	{right, PidPong} -> io:format("I do nothing~n")
  end.
