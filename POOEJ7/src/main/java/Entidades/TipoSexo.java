/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Evocuer
 */
public enum TipoSexo {
    
    HOMBRE ("H"),
    MUJER ("M"),
    OTRO ("O");
    
    private String sexLetter;
    
    private TipoSexo (String sexLetter) {
        this.sexLetter = sexLetter;
    }

    public String getSexLetter() {
        return sexLetter;
    }
    
    
}
