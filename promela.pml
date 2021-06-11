mtype = {ping, pong, right, left};

chan pingpong = [0] of {mtype};
chan pongping = [0] of {mtype};
chan pongright = [0] of {mtype};
chan rightpong = [0] of {mtype};

bit msgSent = 0;
bit msgRcv = 0;

proctype Right() {
	mtype weGotRight;
	pongright ? weGotRight;
	rightpong ! left;
}


proctype Ping() {
	mtype weGot;
	pingpong ! ping;
	msgSent = 1;
	pongping ? weGot;

	if ::(weGot == pong) -> {
		msgRcv = 1;
		printf("ok\n");
	} :: else -> skip;
	fi
}

proctype Pong() {
	mtype weGot, weGotRight;
	pingpong ? weGot;
	if ::(weGot == ping) -> {
		if
		:: true -> {
			pongright ! right;
			rightpong ? weGotRight;
			if ::(weGotRight == right) ->
				;
				::else -> skip;
			fi
		}
		fi
	} ::else -> skip;
	fi
}

active proctype main() {
	run Ping();
	run Pong();
	run Right();
}

ltl check_me {[] (msgSent -> <> msgRcv)}