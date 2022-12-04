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
        switch (attribute) {
            case ENCOURS:
                return 1;
            case APPROUVEE:
                return 2;
            case LIVREE:
                return 3;
            case ANNULEE:
                return 0;
            default:
                return 1;
        }
    }

    @Override
    public CommandeEtat convertToEntityAttribute(Integer dbData) {
        switch (dbData) {
            case 1:
                return CommandeEtat.ENCOURS;
            case 2:
                return CommandeEtat.APPROUVEE;
            case 3:
                return CommandeEtat.LIVREE;
            default:
                return CommandeEtat.ANNULEE;
        }
    }

}
