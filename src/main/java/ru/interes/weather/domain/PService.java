package ru.interes.weather.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class PService {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Заполните имя погодного сервиса")
    @Length(max = 2048, message = "Имя погодного сервиса (длиннее 2kB)")
    private String nameps;

    @NotBlank(message = "Заполните URL погодного сервиса ? - город")
    @Length(max = 2048, message = "URL погодного сервиса(длиннее 2kB)")
    private String urlps;

    private String temp_sig;

    private String temp;

    public PService(String nameps, String nameps1, String temp_sig, String temp) {
        this.nameps = nameps;
        this.nameps = nameps1;
        this.temp_sig = temp_sig;
        this.temp = temp;
    }

    public String getUrlps() {
        return urlps;
    }

    public void setUrlps(String urlps) {
        this.urlps = urlps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameps() {
        return nameps;
    }

    public void setNameps(String nameps) {
        this.nameps = nameps;
    }

    public String getTemp_sig() {
        return temp_sig;
    }

    public void setTemp_sig(String temp_sig) {
        this.temp_sig = temp_sig;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
