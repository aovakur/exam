package ru.aspu.oop.auction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuctionProgram {

	private BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	
	private Auction auction;

	public AuctionProgram () {
		auction = new Auction();
	}
	
	public void run() throws Exception {
		int selection;
		do {
			// ���������� ��������� ��������� ������� ���� ����
			selection = menu();
			if (selection == 1) {
				System.out.println("������� �������� ����");
				String description = br.readLine();
				auction.enterLot(description);
			}
			if (selection == 2) {
				System.out.println("������� ����� ����");
				int lotNumber = Integer.parseInt(br.readLine());
				Lot lot = auction.getLot(lotNumber);
				System.out.println(lot.getNumber() + ": " + lot.getDescription());
			}
			if (selection == 3) {
				auction.showLots();
			}
			if (selection == 4) {
				System.out.println("������� ����� ����");
				int lotNumber = Integer.parseInt(br.readLine());
				System.out.println("������� ��� ����������");
				String bidder = br.readLine();
				System.out.println("������� ������");
				long bidValue = Long.parseLong(br.readLine());
				auction.bidFor(lotNumber, bidder, bidValue);
			}
			if (selection == 5) {
				auction.close();
			}

		} while (selection != 0);
		System.exit(0);

	}

	// ����� ������� ���� � ����������� � ������������ ����� ��������
	public int menu() throws IOException {
		System.out.println("�������� ��������:");
		System.out.println("1 - �������� ���");
		System.out.println("2 - �������� ���");
		System.out.println("3 - �������� ��� ����");
		System.out.println("4 - ������� ������ �� ����");
		System.out.println("5 - ������� �������");

		System.out.println("0 - ��������� ������");
		String input = br.readLine();
		int selection = Integer.parseInt(input);
		return selection;
	}

}
