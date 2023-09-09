package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbUsuario;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
     System.out.println("============PRUEBA EN JPA============");
		
        System.out.println("Listar a tabla usuario");
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_Sesion01");
		
		EntityManager em = fabrica.createEntityManager();
		
		List<TbUsuario> lstusuarios = em.createQuery("select a from TbUsuario a",TbUsuario.class).getResultList();
				
		System.out.println("nro de usuarios "+lstusuarios.size());

	}

}
