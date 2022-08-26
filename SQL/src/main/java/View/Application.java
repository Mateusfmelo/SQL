package View;
import model.Cadastro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Application {
	
	public static void main(String[] args) {
	
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.events.jpa");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
		
            
            	// INSERIR
		Cadastro cadastro = new Cadastro(null, "Mateus", "Brasil", "Paraíba");
		entityManager.getTransaction().begin();
		entityManager.persist(cadastro);
		entityManager.getTransaction().commit();
            

                // BUSCAR
		Cadastro cadastro1 = entityManager.find(Cadastro.class, 15);
		System.out.println("Nome do cliente: " + cadastro1.getNome());
                System.out.println("País de origem: " + cadastro1.getPais());
                System.out.println("Estado de origem: " + cadastro1.getEstado());
		
		
		// DELETAR
                Cadastro cadastro2 = entityManager.find(Cadastro.class, 14);
		entityManager.getTransaction().begin();
		entityManager.remove(cadastro2);
		entityManager.getTransaction().commit();
                
                
		// ATUALIZAR
		Cadastro cadastro3 = new Cadastro();
		cadastro3.setId(13);
		cadastro3.setNome("Euclides José");
                cadastro3.setPais("Brasil");
                cadastro3.setEstado("Paraíba");
		
		entityManager.getTransaction().begin();
		entityManager.merge(cadastro3);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
			
            }
}
