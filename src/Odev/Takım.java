package com.bilgeadam.odev004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Takım {

	private String takimIsim, sehir;
	private int stadyumKapasite;
	private List<Futbolcu> futbolcular;
	private TeknikDirektor teknikDirektor;
	private List<Antrenor> antrenorler;
	private SaglikPersonel saglikPersonel;

	Scanner scanner = new Scanner(System.in);

	public Takım(String takimIsim, String sehir, int stadyumKapasite) {
		super();
		this.takimIsim = takimIsim;
		this.sehir = sehir;
		this.stadyumKapasite = stadyumKapasite;
		this.futbolcular = new ArrayList<>();

	}

	public void takimOlustur() {
		System.out.println("Taktik girin (Örn. 4-4-2)");
		String taktik = scanner.nextLine();
		String[] taktikArray = taktik.split("-");
		int[] array = new int[taktikArray.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(taktikArray[i]);
		}
		int toplam = Arrays.stream(array).sum();

		if (toplam != 11) {
			System.out.println("Yanlış giriş");

		} else {
			Kaleci kaleci = new Kaleci();
			kaleci.setNo(1);
			futbolcular.add(kaleci);
			for (int i = 0; i < array[0]; i++) {
				Defans defans = new Defans();
				defans.setNo(i + 2);
				futbolcular.add(defans);

			}
			for (int i = 0; i < array[1]; i++) {
				OrtaSaha ortaSaha = new OrtaSaha();
				ortaSaha.setNo(i + 2 + Integer.parseInt(taktikArray[0]));
				futbolcular.add(ortaSaha);
			}
			for (int i = 0; i < array[2]; i++) {
				Forvet forvet = new Forvet();
				forvet.setNo(i + 2 + array[0] + array[1]);
				futbolcular.add(forvet);
			}

		}

	}

	@Override
	public String toString() {
		return "Takım [takimIsim=" + takimIsim + ", sehir=" + sehir + ", futbolcular=" + futbolcular
				+ ", teknikDirektor=" + teknikDirektor + "]";
	}

	public String getTakimIsim() {
		return takimIsim;
	}

	public void setTakimIsim(String takimIsim) {
		this.takimIsim = takimIsim;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public int getStadyumKapasite() {
		return stadyumKapasite;
	}

	public void setStadyumKapasite(int stadyumKapasite) {
		this.stadyumKapasite = stadyumKapasite;
	}

	public List<Futbolcu> getFutbolcular() {
		return futbolcular;
	}

	public void setFutbolcular(List<Futbolcu> futbolcular) {
		this.futbolcular = futbolcular;
	}

	public TeknikDirektor getTeknikDirektor() {
		return teknikDirektor;
	}

	public void setTeknikDirektor(TeknikDirektor teknikDirektor) {
		this.teknikDirektor = teknikDirektor;
	}

	public List<Antrenor> getAntrenorler() {
		return antrenorler;
	}

	public void setAntrenorler(List<Antrenor> antrenorler) {
		this.antrenorler = antrenorler;
	}

	public SaglikPersonel getSaglikPersonel() {
		return saglikPersonel;
	}

	public void setSaglikPersonel(SaglikPersonel saglikPersonel) {
		this.saglikPersonel = saglikPersonel;
	}

}
