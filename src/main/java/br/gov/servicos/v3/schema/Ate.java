
package br.gov.servicos.v3.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="max" use="required" type="{http://servicos.gov.br/v3/schema}UnidadeDeTempo" />
 *       &lt;attribute name="unidade" use="required" type="{http://servicos.gov.br/v3/schema}TipoDeTempoTotalEstimado" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ate")
public class Ate {

    @XmlAttribute(name = "max", required = true)
    protected int max;
    @XmlAttribute(name = "unidade", required = true)
    protected TipoDeTempoTotalEstimado unidade;

    /**
     * Gets the value of the max property.
     * 
     */
    public int getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     */
    public void setMax(int value) {
        this.max = value;
    }

    /**
     * Gets the value of the unidade property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDeTempoTotalEstimado }
     *     
     */
    public TipoDeTempoTotalEstimado getUnidade() {
        return unidade;
    }

    /**
     * Sets the value of the unidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDeTempoTotalEstimado }
     *     
     */
    public void setUnidade(TipoDeTempoTotalEstimado value) {
        this.unidade = value;
    }

}
