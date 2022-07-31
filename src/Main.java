import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

      //  System.out.println(curso1);
      //  System.out.println(curso2);
      //  System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos incritos" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("----------");

        Dev devBongo = new Dev();
        devBongo.setNome("Bongo");
        devBongo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos" + devBongo.getConteudosInscritos());
        devBongo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos incritos" + devBongo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devBongo.getConteudosConcluidos());
        System.out.println("XP: " + devBongo.calcularTotalXp());



    }
}
