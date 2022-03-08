import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Devs;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main (String[]args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descição curso java");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScript");
        curso2.setDescricao("descição curso javaScript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("conhecendo java");
        mentoria.setData(LocalDate.now());

      /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

       */
        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp java deves");
        bootcamp.setDescricao(" Descrição Bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Devs devRobenson = new Devs();
        devRobenson.setNome("Robenson");
        devRobenson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos Robenson:" +devRobenson.getConteudosInscritos());
        devRobenson.progredir();
        System.out.println(" - ");
        System.out.println("Conteudo inscritos Robenson:" +devRobenson.getConteudosInscritos());
        System.out.println("Conteudo concluidos Robenson:" +devRobenson.getConteudosConcluidos());
        System.out.println("Xp:" + devRobenson.calcularTotalxp());

        Devs devPierre = new Devs();
        devPierre.setNome("Pierre");
        devPierre.inscreverBootcamp(bootcamp);
        System.out.println("conteudo inscritos Pierre:" + devPierre.getConteudosInscritos());
        devPierre.progredir();
        System.out.println("-");
        System.out.println("Conteudo inscritos Robenson:" +devRobenson.getConteudosInscritos());
        System.out.println("Conteudo concluidos Robenson:" +devPierre.getConteudosConcluidos());
        System.out.println("Xp:" + devRobenson.calcularTotalxp());




    }
}
