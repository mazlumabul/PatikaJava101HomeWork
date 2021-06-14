package mineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	public int rowNumber;
	public int colNumber;
	public int size;
	public String[][] map;
	public String[][] board;
	public boolean game = true;;

	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	public MineSweeper() {
		
	}
	public MineSweeper(int rowNumber, int colNumber) {
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.map = new String[rowNumber][colNumber];
		this.board = new String[rowNumber][colNumber];
		this.size = rowNumber * colNumber;

	}
	public void start() {
		int row, column;

		System.out.println("Lütfen Oynamak istediðiniz boyutlarý giriniz ");

		System.out.print("Satýr sayýsý : ");
		row = scanner.nextInt();

		System.out.print("Sütun sayýsý : ");
		column = scanner.nextInt();

		 MineSweeper mine = new MineSweeper(row, column);
		 mine.run();
	}
	public void run() {
		int row;
		int col;
		int success=0;
		
		prepareGame();
		//print(map);

		System.out.println("! Mayýn Tarlasýna Hoþgeldiniz !");
		while (game) {
			print(board);
			System.out.print("Satýr Giriniz : ");
			row = scanner.nextInt();

			System.out.print("Sütun Giriniz : ");
			col = scanner.nextInt();
			
			
			if(row <0 || row >= rowNumber || col < 0 || col >=colNumber) {
				System.out.println("Geçersiz Koordinat");
				continue;
			}

			if (map[row][col] != " * ") { // mayýn yok ise
				checkMine(row, col);
				success++;
				if(success == (size -(size/4))){
					System.out.println("TEBRÝKLER KAZANDINIZ");
					break;
				}
			} else {
				game = false;
				System.out.println("GAME OVER ");
			}

		}

	}
	

	public void checkMine(int r, int c) {
		if (board[r][c] == " - ") { // tekrar kontrol edip arttýrmamasý için
			int sum = 0;

			if ((r > 0) && (c > 0) && (map[r - 1][c - 1] == " * ")) { // kontrol edilecek indeksin sýnýr kontrolü ve
																		// sol-üst indeksi
				sum++;
				board[r][c] = " " + String.valueOf(sum) + " ";
			}
			if ((c > 0) && (map[r][c - 1] == " * ")) { // kontrol edilecek sýnýr kontrolü ve indeksin üst indeksi
				sum++;
				board[r][c] = " " + String.valueOf(sum) + " ";
			}
			if ((c > 0) && (r < rowNumber-1) && (map[r + 1][c - 1] == " * ")) { // kontrol edilecek indeksin sýnýr
																				// kontrolü ve sað-üst indeksi
				sum++;
				board[r][c] = " " + String.valueOf(sum) + " ";
			}
			if ((r > 0) && (map[r - 1][c] == " * ")) {// kontrol edilecek indeksin sýnýr kontrolü ve sol indeksi
				sum++;
				board[r][c] = " " + String.valueOf(sum) + " ";
			}
			if ((r < rowNumber - 1) && (map[r + 1][c] == " * ")) { // kontrol edilecek indeksin sýnýr kontrolü ve sað
																	// indeksi
				sum++;
				board[r][c] = " " + String.valueOf(sum) + " ";
			}
			if ((r > 0) && (c < colNumber-1) && (map[r - 1][c + 1] == " * ")) { // kontrol edilecek indeksin sýnýr
																				// kontrolü ve sol - alt indeksin
				sum++;
				board[r][c] = " " + String.valueOf(sum) + " ";
			}

			if ((c < colNumber - 1) && (map[r][c + 1] == " * ")) { // kontrol edilecek indeksin sýnýr kontrolü ve alt
																	// indeksi
				sum++;
				board[r][c] = " " + String.valueOf(sum) + " ";
			}

			if ((r < rowNumber-1) && (c < colNumber-1) && (map[r + 1][c + 1] == " * ")) { // kontrol edilecek indeksin sýnýr
																						// kontrolü ve sað - alt indeksi
				sum++;
				board[r][c] = " " + String.valueOf(sum) + " ";
			}
			if(board[r][c] == " - ") {
				board[r][c] = " 0 ";
			}
		}

	}

	public void prepareGame() {

		int randRow;
		int randCol;
		int count = 0;
		while (count != (size / 4)) {
			randRow = random.nextInt(rowNumber);
			randCol = random.nextInt(colNumber);
			if (map[randRow][randCol] != " * ") {
				map[randRow][randCol] = " * ";
				count++;
			}
		}
	}

	public void print(String[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == null) {
					arr[i][j] = " - ";
				}
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
