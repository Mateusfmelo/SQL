package model;
import javax.persistence.*;

@Entity
@Table(name = "cadastro")
public class Cadastro{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column (name = "nome")
    private String nome;
    
    @Column(name = "pais")
    private String pais;
    
    @Column(name = "estado")
    private String estado;
     

    public Cadastro(){
        
    }

    public Cadastro(Integer id, String nome, String pais, String estado) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "id=" + id + ", nome=" + nome + ", pais=" + pais + ", estado=" + estado + '}';
    }
}
