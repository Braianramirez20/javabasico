package com.senati.ddw04;

public class ImplementaCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto celular1 de la clase celular
		//Clase objeto = new Clase(1,"Huawei",900)
		//Clase objeto = new Clase();
		//objeto.id =;
		//objeto.marca="Huawei";
		//objeto.precio = 900f;
		Celular cel1 = new Celular ();
		cel1.id =1;
		cel1.modelo ="Venus 2019";
		cel1.precio = 900f;
		
		System.out.println("Datos registrados");
		System.out.println(cel1.toString());
		
		//Crea un objeto cel2 y agregar sus caracteristicas
		
		Celular cel2 = new Celular ();
		cel2.id = 2;
		cel2.modelo = "Samsumg 2020";
		cel2.precio = 550f;
		
		System.out.println("Datos registrados");
		System.out.println(cel2.toString());
		
	}

}
