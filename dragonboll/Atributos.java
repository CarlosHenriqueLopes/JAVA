package dragonboll;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Atributos {

    private String nomeIMG, origem = "";

    // Duvida!
    // Por que o parametro e o instanciamento da classe tem que ficar dentro do método?
    
    //String imgCaminho = String.format("D:\\Documentos\\Project\\AulasIniciais\\src\\dragonboll\\img\\%s.png", getNomeIMG());
    //ImageIcon icon = new ImageIcon(imgCaminho);  // classe para usar icons, no parâmetro final do JOptionPane.showMessageDialog, pode colocar um icon


    public void getInformacoes(){
        String imgCaminho = String.format("C:\\Users\\carlos\\Documents\\GitHub\\JAVA\\dragonboll\\img\\%s.png", getNomeIMG());
        
        ImageIcon icon = new ImageIcon(imgCaminho);  // classe para usar icons, no parâmetro final do JOptionPane.showMessageDialog, pode colocar um icon
        
        String infos = String.format(" Personagem: %s\n Origem: %s", getNomeIMG(), getOrigem());
        JOptionPane.showMessageDialog(null, infos, "INFORMAÇÔES:", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public String getNomeIMG(){
        return this.nomeIMG;
    }

    public void setNomeIMG(String img){
        if (img.equals("Goku")){
            this.nomeIMG = "goku-icone";
        } else if (img.equals("Piccolo")){
            this.nomeIMG = "piccolo-icone";
        } else if (img.equals("Vegeta")){
            this.nomeIMG = "vegeta-icone";
        } else if (img.equals("Bulma")){
            this.nomeIMG = "bulma-icone";
        } else if (img.equals("Kuririn")){
            this.nomeIMG = "kuririn-icone";
        } else {
            this.nomeIMG = "Não está nos registros";
        }
    }

    public String getOrigem(){
        return this.origem;
    }

    public void setOrigem(String origem){
        if (origem.equals("Goku")){
            this.origem = "Planeta Jayajin";
        } else if (origem.equals("Piccolo")){
            this.origem = "Planeta Nanicokin";
        } else if (origem.equals("Vegeta")){
            this.origem = "Planeta Sayajin";
        } else if (origem.equals("Bulma")){
            this.origem = "Planeta Terra";
        } else if (origem.equals("Kuririn")){
            this.origem = "Planeta Terra";
        } else {
            this.origem = "Origem desconhecida";
        }
    }

}
