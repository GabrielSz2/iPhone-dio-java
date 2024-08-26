package entities;

import entities.interfaces.MusicPlayer;
import entities.interfaces.TelephoneSystem;
import entities.interfaces.WebBrowser;

public class iPhone implements MusicPlayer, TelephoneSystem, WebBrowser{
	
	private boolean isOn;
	
	public iPhone() {
		this.isOn = false;
	}
	
	public void turnOn() {
		if(!isOn) {
			isOn = true;
			System.out.println("iPhone ligado!");
		}
		else{
			System.out.println("O iPhone já está ligado!");
		}
	}
	
	public void turnOff() {
		if(isOn) {
			isOn = false;
			System.out.println("iPhone desligado!");
		}
		else{
			System.out.println("O iPhone já está desligado!");
		}
	}
	
	public void returnMenu() {
		if(isOn) {
			System.out.println("Pronto, retornamos para o menu!");
		}
		else{
			System.out.println("O iPhone está desligado!");
		}
	}
	
	@Override
	public void displayPage(String url) {
		if(isOn) {
			System.out.println("Exibindo página: " + url);
		}
		else{
			System.out.println("O iPhone está desligado!");
		}
		
	}

	@Override
	public void openNewTab() {
		if(isOn) {
			System.out.println("Nova aba adicionada.");
		}
		else{
			System.out.println("O iPhone está desligado!");
		}
	}

	@Override
	public void refreshPage() {
		if(isOn) {
			System.out.println("Página atualizada.");
		}
		else{
			System.out.println("O iPhone está desligado!");
		}
	}

	@Override
	public void call(String number) {
		if(isOn) {
			System.out.println("Ligando para " + number + "...");
		}
		else{
			System.out.println("O iPhone está desligado!");
		}
	}

	@Override
	public void answer() {
		if(isOn) {
			System.out.println("Atendendo chamada...");
		}
		else{
			System.out.println("O iPhone está desligado!");
		}
	}

	@Override
	public void startVoicemail() {
		if(isOn) {
			System.out.println("Iniciando correio de voz...");
		}
		else{
			System.out.println("O iPhone está desligado!");
		}
	}

	@Override
	public void play() {
		if(isOn) {
			System.out.println("Tocando música...");
		}
		else{
			System.out.println("O iPhone está desligado!");
		}
	}

	@Override
	public void pause() {
		if(isOn) {
			System.out.println("Música pausada.");
		}
		else{
			System.out.println("O iPhone está desligado!");
		}
	}

	@Override
	public void selectSong(String song) {
		if(isOn) {
			System.out.println("Música selecionada: " + song);
		}
		else{
			System.out.println("O iPhone está desligado!");
		}
	}

}
