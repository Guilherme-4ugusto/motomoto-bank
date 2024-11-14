package avl;

public class Arvore<T extends Comparable<T>> {

    private No<T> raiz;
    
    private int tamanho;

    public No<T> getRaiz() {
        return raiz;
    }

    public void inserir(T valor) {
        raiz = inserir(raiz, valor);
        tamanho++;
    }

    private No<T> inserir(No<T> no, T valor) {
        if (no == null) {
            return new No<>(valor);
        }
        if (valor.compareTo(no.getValor()) < 0) {
            no.setEsquerda(inserir(no.getEsquerda(), valor));
        } else if (valor.compareTo(no.getValor()) > 0) {
            no.setDireita(inserir(no.getDireita(), valor));
        } else {
            return no;
        }

        atualizarAlturaEFB(no);
        return balancear(no);
    }

    public void remover(T valor) {
        raiz = remover(raiz, valor);
    }

    private No<T> remover(No<T> no, T valor) {
        if (no == null) {
            return null;
        }

        if (valor.compareTo(no.getValor()) < 0) {
            no.setEsquerda(remover(no.getEsquerda(), valor));
        } else if (valor.compareTo(no.getValor()) > 0) {
            no.setDireita(remover(no.getDireita(), valor));
        } else {
            if (no.getEsquerda() == null || no.getDireita() == null) {
                no = (no.getEsquerda() != null) ? no.getEsquerda() : no.getDireita();
            } else {
                No<T> sucessor = obterMin(no.getDireita());
                no.setValor(sucessor.getValor());
                no.setDireita(remover(no.getDireita(), sucessor.getValor()));
            }
        }

        if (no != null) {
            atualizarAlturaEFB(no);
            no = balancear(no);
        }
        return no;
    }

    private No<T> obterMin(No<T> no) {
        while (no.getEsquerda() != null) {
            no = no.getEsquerda();
        }
        return no;
    }

    private void atualizarAlturaEFB(No<T> no) {
        int alturaEsquerda = (no.getEsquerda() != null) ? no.getEsquerda().getAltura() : -1;
        int alturaDireita = (no.getDireita() != null) ? no.getDireita().getAltura() : -1;

        no.setAltura(1 + Math.max(alturaEsquerda, alturaDireita));
        no.setFatorBalanceamento(alturaDireita - alturaEsquerda);
    }

    private No<T> balancear(No<T> no) {
        if (no.getFatorBalanceamento() == -2) {
            if (no.getEsquerda().getFatorBalanceamento() <= 0) {
                no = rotacaoDireita(no);
            } else {
                no.setEsquerda(rotacaoEsquerda(no.getEsquerda()));
                no = rotacaoDireita(no);
            }
        } else if (no.getFatorBalanceamento() == 2) {
            if (no.getDireita().getFatorBalanceamento() >= 0) {
                no = rotacaoEsquerda(no);
            } else {
                no.setDireita(rotacaoDireita(no.getDireita()));
                no = rotacaoEsquerda(no);
            }
        }
        return no;
    }

    private No<T> rotacaoDireita(No<T> no) {
        No<T> esquerda = no.getEsquerda();
        no.setEsquerda(esquerda.getDireita());
        esquerda.setDireita(no);

        atualizarAlturaEFB(no);
        atualizarAlturaEFB(esquerda);

        return esquerda;
    }

    private No<T> rotacaoEsquerda(No<T> no) {
        No<T> direita = no.getDireita();
        no.setDireita(direita.getEsquerda());
        direita.setEsquerda(no);

        atualizarAlturaEFB(no);
        atualizarAlturaEFB(direita);

        return direita;
    }

    public void exibirEmOrdem() {
        exibirEmOrdem(raiz);
    }

    private void exibirEmOrdem(No<T> no) {
        if (no != null) {
            exibirEmOrdem(no.getEsquerda());
            System.out.print(no.getValor() + " ");
            exibirEmOrdem(no.getDireita());
        }
    }

	public int getTamanho() {
		return tamanho;
	}
	
	public T buscar(T valor) {
        return buscar(raiz, valor);
    }

    private T buscar(No<T> no, T valor) {
        if (no == null) {
            return null;
        }

        if (valor.compareTo(no.getValor()) == 0) {
            return no.getValor();
        }

        if (valor.compareTo(no.getValor()) < 0) {
            return buscar(no.getEsquerda(), valor);
        } 

        else {
            return buscar(no.getDireita(), valor);
        }
    }

}
