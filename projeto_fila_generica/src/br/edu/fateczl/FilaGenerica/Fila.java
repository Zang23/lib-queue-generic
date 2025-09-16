package br.edu.fateczl.FilaGenerica;

import br.edu.fateczl.FilaGenerica.No;

public class Fila<T> {
	
	No<T> inicio;
	No<T> fim;
	
	public boolean isEmpty() {
		if(inicio == null && fim == null) {
			return true;
		}
		return false;
	}
	
	
	public void insert(T valor) {
		
		No<T> elemento = new No<>();
		elemento.dado = valor;
		if(isEmpty()) {
			inicio = elemento;
			fim = inicio;
		}else {
			fim.proximo = elemento;
			fim = elemento;
		}
		
	}
	
	
	public T remove()throws Exception {
		
		if(isEmpty()) {
			throw new Exception("A fila esta vazia.");
		}
		
		T valor = inicio.dado;
		if(inicio == fim && inicio != null) {
			inicio = null;
			fim = null;
		}else {
			inicio = inicio.proximo;	
		}
		return valor;
	}
	
	public void list()throws Exception {
		if(isEmpty()) {
			throw new Exception("A fila esta vazia");
		}else {
			No<T> aux = inicio;
			
			while(aux != null) {
				System.out.print("[" + aux.dado + "] ");
				aux = aux.proximo;
			}
		}
		
	}
	
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			No<T> aux = inicio;
			while(aux != null) {
				cont++;
				aux = aux.proximo;
			}
		}
		
		return cont;
		
	}
	
	
}
