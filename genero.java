public class genero {
    public String Masculino;
    public String Feminino;
    public String SemGenero;
    public String  Tribal;
    public String Experimento;
    public String  Orfao;
 



    public genero(String Feminino, String Masculino,String SemGenero,String Tribal,String Experimento,String Orfao) {
        this.Feminino = Feminino;
        this.Masculino = Masculino;
        this.SemGenero= SemGenero;
        this.Tribal=Tribal;
        this.Experimento=Experimento;
        this.Orfao=Orfao;
    }
    public  String getMasculino(){
        return  Masculino;

    }

    public  String getFeminino(){
        return Feminino;

    }

    public  String getSemGenero(){
        return SemGenero;

    }
    public  String getTribal(){
        return Tribal;

    }
    public  String getExperimento(){
        return Experimento;

    }
    public  String getOrfao(){
        return Orfao;

    }
}