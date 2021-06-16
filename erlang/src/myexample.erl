-module(myexample).
-compile(export_all).


%%
% Обычный пинг-понг
%
main() ->
  spawn(fun() ->
    ping(spawn(fun()-> pong() end))
        end
  ).



ping(PidPong)->

%Pid1 = spawn(fun()-> pong() end),
  io:format("~nI'm ping, pids are : ~w(pong) ~w(ping) ~n", [PidPong, self()]),
  io:format("I send ping!!! ~n"),
  %Pid1 ! {ping, self()},
  PidPong ! {ping, self()},
  io:format("waiting for pong...~n"),

  receive
    pong -> io:format("PONG received~n")
  end.



pong()->
  io:format("~nI'm pong, my pid is : ~w ~n", [self()]),

  receive
    {ping , PidPing} ->
      io:format("~nPING received, sending pong~n"),
      PidPing ! pong
  end.