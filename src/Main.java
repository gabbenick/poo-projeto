import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de introdução a Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso de introdução a JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.of(2022, 12, 15));

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Bootcamp sobre Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev desenvolvedor1 = new Dev();
        desenvolvedor1.setNome("Marcos");
        desenvolvedor1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + desenvolvedor1.getConteudosInscritos());
        desenvolvedor1.progredir();
        System.out.println("Conteúdos Inscritos" + desenvolvedor1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + desenvolvedor1.getConteudosConcluidos());
        System.out.println("XP: " + desenvolvedor1.calcularTotalXp());

        Dev desenvolvedor2 = new Dev();
        desenvolvedor2.setNome("Bianca");
        desenvolvedor2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + desenvolvedor2.getConteudosInscritos());
        desenvolvedor2.progredir();
        System.out.println("Conteúdos Inscritos" + desenvolvedor2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + desenvolvedor2.getConteudosConcluidos());
        System.out.println("XP: " + desenvolvedor2.calcularTotalXp());

    }
}
