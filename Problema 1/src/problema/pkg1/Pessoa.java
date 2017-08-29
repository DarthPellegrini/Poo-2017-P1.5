/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1;

/**
 *
 * @author m78159
 */
public class Pessoa {
    private int idade;
    private String name;

    Pessoa(String name, int idade){
        setName(name);
        setIdade(idade);
    }
    
    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public final void setIdade(int idade) {
        if(idade >= 0)
            this.idade = idade;
        else
            this.idade = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public final void setName(String name) {
        this.name = name;
    }
    
}
