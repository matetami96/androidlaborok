package ro.sapi.retrofitstudents;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nev")
    @Expose
    private String nev;
    @SerializedName("szak")
    @Expose
    private String szak;
    @SerializedName("evfolyam")
    @Expose
    private Integer evfolyam;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzak() {
        return szak;
    }

    public void setSzak(String szak) {
        this.szak = szak;
    }

    public Integer getEvfolyam() {
        return evfolyam;
    }

    public void setEvfolyam(Integer evfolyam) {
        this.evfolyam = evfolyam;
    }

}