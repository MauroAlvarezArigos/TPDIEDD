package guia05.domain;

import java.util.ArrayList;

public class Usuario {
	private String email;
	private ArrayList<Contratable> itemsContratados;
	
	
	//Constructor
	public Usuario(String email) {
		super();
		this.email = email;
		this.itemsContratados = new ArrayList<Contratable>();
	}
	
	//Getters and Setters
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	//Methods
	public void Contratar(Contratable unContratable) {
		try {
			if(unContratable.getClass().isInstance(new Alquiler())){
				if(this.verificarAlquiler()) {
					itemsContratados.add(unContratable);
				}
			}
			else {
				itemsContratados.add(unContratable);
			}
		}
		catch(AlquilerNoEntregadoException e) {
			e.printStackTrace();
		}
	
	}

	private Boolean verificarAlquiler() throws AlquilerNoEntregadoException{
		int cont = 0;
		for(Contratable c : this.itemsContratados){
			if(c.getClass().isInstance(new Alquiler())) {
				cont++;
			}
		}
		
		if(cont < 2) {
			return true;
		}
		else throw new AlquilerNoEntregadoException();
	}
}
