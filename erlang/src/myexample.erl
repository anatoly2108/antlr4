-module(myexample).
-compile(export_all).

f1() ->
  1+2+3+4+5+6+7,
  io:fwrite("hello, world\n").


f2() ->
  3 - 2.