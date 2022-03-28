import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

    //https://github.com/cami-la/desafio-poo-dio
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso python");
        curso1.setDescricao("descrição vai aqui");
        curso1.setCargaHoraria(100);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(42);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devPoulsen = new Dev();
        devPoulsen.setNome("Camila");
        devPoulsen.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Poulsen:" + devPoulsen.getConteudosInscritos());
        devPoulsen.progredir();
        devPoulsen.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Poulsen:" + devPoulsen.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Poulsen:" + devPoulsen.getConteudosConcluidos());
        System.out.println("XP:" + devPoulsen.calcularTotalXp());

        System.out.println("-------");

        Dev devNull = new Dev();
        devNull.setNome("Joao");
        devNull.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Null:" + devNull.getConteudosInscritos());
        devNull.progredir();
        devNull.progredir();
        devNull.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Null:" + devNull.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Null:" + devNull.getConteudosConcluidos());
        System.out.println("XP:" + devNull.calcularTotalXp());

    }

}