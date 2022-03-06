import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentaria de java");
        mentoria.setDescricao("Descricao da mentoria");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("----------");
        Dev devAllan = new Dev();
        devAllan.setNome("Allan Gedeão");
        devAllan.inscreverBootcamp(bootcamp);
        devAllan.progredir();
        System.out.println(devAllan.getNome());
        System.out.println("Conteudo instritos " + devAllan.getConteudoInscrito());
        System.out.println("Conteudo concluidos " + devAllan.getConteudoConcluido());
        System.out.println("XP:  " + devAllan.calcularTotalXp());

        System.out.println("----------");
        Dev devAna = new Dev();
        devAllan.setNome("Ana Paula");
        devAna.inscreverBootcamp(bootcamp);
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println(devAna.getNome());
        System.out.println("Conteudo instritos " + devAna.getConteudoInscrito());
        System.out.println("Conteudo concluidos " + devAna.getConteudoConcluido());
        System.out.println("XP:  " + devAna.calcularTotalXp());
    }
}
