/**
 *  Este arquivo é parte do Biblivre3.
 *  
 *  Biblivre3 é um software livre; você pode redistribuí-lo e/ou 
 *  modificá-lo dentro dos termos da Licença Pública Geral GNU como 
 *  publicada pela Fundação do Software Livre (FSF); na versão 3 da 
 *  Licença, ou (caso queira) qualquer versão posterior.
 *  
 *  Este programa é distribuído na esperança de que possa ser  útil, 
 *  mas SEM NENHUMA GARANTIA; nem mesmo a garantia implícita de
 *  MERCANTIBILIDADE OU ADEQUAÇÃO PARA UM FIM PARTICULAR. Veja a
 *  Licença Pública Geral GNU para maiores detalhes.
 *  
 *  Você deve ter recebido uma cópia da Licença Pública Geral GNU junto
 *  com este programa, Se não, veja em <http://www.gnu.org/licenses/>.
 * 
 *  @author Alberto Wagner <alberto@biblivre.org.br>
 *  @author Danniel Willian <danniel@biblivre.org.br>
 * 
 */

package biblivre3.circulation;

import mercury.DTO;

public class UserTypeDTO extends DTO {

    private Integer serial;
    private String description;
    private String name;
    private Integer maxLendingCount;
    private Integer maxLendingDays;
    private Integer maxReservationDays;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMaxLendingCount() {
        return maxLendingCount;
    }

    public void setMaxLendingCount(Integer maxLendingCount) {
        this.maxLendingCount = maxLendingCount;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public Integer getMaxLendingDays() {
        return maxLendingDays;
    }

    public void setMaxLendingDays(Integer maxLendingDays) {
        this.maxLendingDays = maxLendingDays;
    }

    public Integer getMaxReservationDays() {
        return maxReservationDays;
    }

    public void setMaxReservationDays(Integer maxReservationDays) {
        this.maxReservationDays = maxReservationDays;
    }

}
