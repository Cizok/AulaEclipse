package br.edu.eteczl.escolabackend;

import br.edu.eteczl.escolabackend.model.Pessoa;
import br.edu.eteczl.escolabackend.model.Aluno;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        Pessoa p = new Aluno("DUDÃO");
        System.out.println(p.falar());
        System.out.println( "Hello World!" );
    }
}
