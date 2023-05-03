package br.com.joik.banco.repository.filter;

import br.com.joik.banco.model.Cliente;

import java.math.BigDecimal;
import java.util.Date;

public class ContasPagarFilter {
    private Cliente cliente;
    private Date data;
    private Date datavencimento;
    private BigDecimal valor;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(Date datavencimento) {
        this.datavencimento = datavencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
