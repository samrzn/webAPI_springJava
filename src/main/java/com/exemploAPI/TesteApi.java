package com.exemploAPI;

import com.exemploAPI.domain.Container;

public class TesteApi {

	public static void main(String[] args) {
		Container c = new Container();
		System.out.println(c);

		Container cc = new Container(2350, "Graneleiro", "Azul", 37, 13100.00);
		System.out.println(cc);

		c.setId(666);
		c.setNome("Dry Box");
		System.out.println(c);

	}

}
