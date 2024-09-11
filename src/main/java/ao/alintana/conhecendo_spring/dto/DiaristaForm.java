package ao.alintana.conhecendo_spring.dto;

public class DiaristaForm {
    private String nome;
    private String telefone;
    private String cfp;

    public DiaristaForm() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((cfp == null) ? 0 : cfp.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DiaristaForm other = (DiaristaForm) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        if (cfp == null) {
            if (other.cfp != null)
                return false;
        } else if (!cfp.equals(other.cfp))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DiaristaForm [nome=" + nome + ", telefone=" + telefone + ", cfp=" + cfp + "]";
    }

}
