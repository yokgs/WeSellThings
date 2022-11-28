/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author user
 */
@Converter
public class CommandeEtatConverter implements AttributeConverter<CommandeEtat, Integer> {

    @Override
    public Integer convertToDatabaseColumn(CommandeEtat attribute) {
        return switch (attribute) {
            case ENCOURS -> 1;
            case APPROUVEE -> 2;
            case LIVREE -> 3;
            case ANNULEE -> 0;
            default -> 1;
        }
    }

    @Override
    public CommandeEtat convertToEntityAttribute(Integer dbData) {
        return switch (dbData) {
            case 1 -> ENCOURS;
            case 2 -> APPROUVEE;
            case 3 -> LIVREE;
            case 0 -> ANNULEE;
            default -> ANNULEE;
        }
    }

}
