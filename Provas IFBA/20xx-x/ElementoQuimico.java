
public class ElementoQuimico{
      private int numeroAtomico;
      private String nome;
      private int numeroMassa;
      private int[] eletrons;
      
      public ElementoQuimico(int numeroAtomico, int numeroMassa, String nome){
            this.setNumeroAtomico(numeroAtomico);
            this.setNumeroMassa(numeroMassa);
            this.setNome(nome);
            this.eletrons = new int[7];
      }

      public int getNumeroAtomico(){
            return this.numeroAtomico;
      }

      public void setNumeroAtomico(int numeroAtomico){
            this.numeroAtomico = numeroAtomico;
      }

      public int getNumeroMassa(){
            return this.numeroMassa;
      }

      public void setNumeroMassa(){
            this.numeroMassa = numeroMassa;
      }

      public String getNome(){
            return this.nome;
      }

      public void setNome(String nome){
            this.nome = nome;
      }

      public boolean equals(ElementoQuimico eq){
            return this.getNumeroAtomico() = eq.getNumeroAtomico();
      }

      public int getQtdeEletrons(int camada){
            return this.eletrons[camada];
      }

      public void setQTdeEletrons(int camada, int qtdeEletrons){
            this.eletrons[camada] = qtdeEletrons;
      }
      
}