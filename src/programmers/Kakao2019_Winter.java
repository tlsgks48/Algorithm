package programmers;

import java.util.*;
import java.util.Random;

public class Kakao2019_Winter {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		// 1. 2차원배열 board구하기(입력값이 주어졌다고 가정..) 2. 크레인 1차원배열 move을 움직여서 인형을 쌓아보자 
		// 3. 크레인으로 움직여서 넣은 바구니 구하기. 4. 크레인을 작동시켜 터트린 인형의 개수(answer)구하기.
		int answer = 0;
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = 	{1,5,3,5,1,2,1,4};
		
		List<Integer> basket = new ArrayList<Integer>();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("["+board[i][j]+"]");
			}
			System.out.println();
		}
		
		

		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1] != 0) { // 크레인이 인형을 잡는다면...
					System.out.println(moves[i]-1+" 크레인위치, 인형 숫자 : "+board[j][moves[i]-1]);
					basket.add(board[j][moves[i]-1]);
					if(basket.size()>1) {
						if(basket.get(basket.size()-1) == basket.get(basket.size()-2)) { // 옮긴 인형이 바구니 맨위 인형과 같다면..
							basket.remove(basket.size()-2); // 인형삭제
							basket.remove(basket.size()-1); // 인형삭제
							answer = answer+2; // 같아서 사라진 인형 2개추가.
						}
					}
					board[j][moves[i]-1] = 0; // 인형을 빼냇다면 없음으로.
					break;
				}
			}
		}
		
		System.out.println(answer);
		System.out.println(board[3][0]);
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("["+board[i][j]+"]");
			}
			System.out.println();
		}
		
		System.out.println(basket);
	}

}
