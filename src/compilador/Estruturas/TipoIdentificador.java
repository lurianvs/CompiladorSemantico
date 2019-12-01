
package compilador.Estruturas;

import java.util.Objects;

public class TipoIdentificador {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoIdentificador other = (TipoIdentificador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public final String nome;
    public final String categoria;
    public final String tipo;
    public final int nivel;

    public TipoIdentificador(String nome, String categoria, String tipo, int nivel) {
        this.nome = nome;
        this.categoria = categoria;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

}
