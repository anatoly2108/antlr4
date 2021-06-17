-module(myexample6).
-compile(export_all).


%%
% названия процессов теперь не ping, pong, right
%
main() ->
  spawn(fun() -> f1(spawn(fun()->f2(spawn(fun()->f3() end))end))end).


f1(PidPong) ->
  PidPong ! {ping, self()},

  receive
    pong -> io:format("ok!~n")
  end.


f2(PidRight) ->

  receive
    {ping, PidPing} -> PidRight ! {right, self()}%,
  %receive
  %right -> PidPing ! pong
  %end
  end.


f3() ->
  receive
    {right, PidPong} -> PidPong ! right
  end.
