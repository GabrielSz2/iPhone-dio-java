package application;

import java.util.Locale;
import java.util.Scanner;

import entities.iPhone;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		iPhone MyPhone = new iPhone();
		boolean isOn=true;
		
		System.out.print("Deseja ligar o iPhone? (y/n): ");
		char c = sc.next().charAt(0);
		if(c == 'y' || c == 'Y') {
			MyPhone.turnOn();
		}
		
		while(isOn) {
			
			if(c == 'y' || c == 'Y') {
				System.out.println("\nO que deseja fazer?");
				System.out.println("1- reprodutor de música");
				System.out.println("2- Aparelho telefonico");
				System.out.println("3- Navegador internet:");
				System.out.println("4- Desligar iPhone");
				System.out.print("Opção: ");
				int option = sc.nextInt();
				
				
				switch(option) {
				case 1:
					System.out.println("\nReprodutor de musica selecionado!");
					System.out.println("O que deseja fazer? ");
					System.out.println("1- selecionar musica");
					System.out.println("2- pausar");
					System.out.println("3- tocar");
					System.out.println("4- voltar ao menu");
					System.out.print("Opção: ");
					int optionSong = sc.nextInt();
					
					while(optionSong != 4) {
		
						switch(optionSong) {
						case 1: 
							System.out.println("\nQual musica deseja tocar: ");
							sc.nextLine();
							String song = sc.nextLine(); 
							MyPhone.selectSong(song);
							
							break;
						case 2: 
							MyPhone.pause();
							
							break;
						case 3: 
							MyPhone.play();
							
							break;
						case 4: 
							MyPhone.returnMenu();
							
							break;
						}
						System.out.print("Opção: ");
						optionSong = sc.nextInt();
					}
					
					break;
					
				case 2: 
					System.out.println("\nAparelho telefonico selecionado!");
					System.out.println("O que deseja fazer? ");
					System.out.println("1- ligar");
					System.out.println("2- atender");
					System.out.println("3- iniciar correio de voz");
					System.out.println("4- voltar ao menu");
					System.out.print("opção: ");
					int optionPhone = sc.nextInt();
					
					while(optionPhone != 4) {
						
						switch(optionPhone) {
						case 1: 
							System.out.println("\nPara qual numero deseja ligar: ");
							sc.nextLine();
							String number = sc.nextLine(); 
							MyPhone.call(number);
							
							break;
						case 2: 
							MyPhone.answer();
							
							break;
						case 3: 
							MyPhone.startVoicemail();
							
							break;
						case 4: 
							MyPhone.returnMenu();
							
							break;
						}
						System.out.print("Opção: ");
						optionPhone = sc.nextInt();
					}
					
					break;
				case 3: 
					System.out.println("\nNavegador internet selecionado!");
					System.out.println("O que deseja fazer? ");
					System.out.println("1- exibir pagina");
					System.out.println("2- adicionar nova aba");
					System.out.println("3- atualizar a pagina");
					System.out.println("4- voltar ao menu");
					System.out.print("opção: ");
					int optionWeb = sc.nextInt();
					
					while(optionWeb != 4) {
						
						switch(optionWeb) {
						case 1: 
							System.out.println("\nQual pagina deseja acessar: ");
							sc.nextLine();
							String page = sc.nextLine(); 
							MyPhone.displayPage(page);
							
							break;
						case 2: 
							MyPhone.openNewTab();
							
							break;
						case 3: 
							MyPhone.refreshPage();
							
							break;
						case 4: 
							MyPhone.returnMenu();
							
							break;
						}
						System.out.print("Opção: ");
						optionWeb = sc.nextInt();
					}
					
					break;
				case 4: 
					MyPhone.turnOff();
					isOn=false;
					
					break;
				default:
					System.out.println("Error!");
					
					break;
				}
			}
			else {
				isOn=false;
			}
		}
		
		System.out.println("Aplicação encerrada.");
		sc.close();
	}
}
