package com.example.retrofit.model;

import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("nama_surveyor")
    private String namasurveyor;

    @SerializedName("nama_responden")
    private String namaresponden;

    @SerializedName("usia")
    private String usia;

    @SerializedName("jenis_kelamin")
    private String jenis_kelamin;

    @SerializedName("pekerjaan")
    private String pekerjaan;

    @SerializedName("id_desa")
    private String id_Desa;

    @SerializedName("nama_desa")
    private String namaDesa;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("longitude")
    private String longitude;

    public String getNamasurveyor(){
        return namasurveyor;
    }

    public String getNamaresponden(){
        return namaresponden;
    }

    public String getUsia(){
        return usia;
    }

    public String getJenis_kelamin(){
        return jenis_kelamin;
    }

    public String getPekerjaan(){
        return pekerjaan;
    }

    public String getId_Desa(){
        return id_Desa;
    }

    public String getNamaDesa(){
        return namaDesa;
    }

    public String getLatitude(){
        return latitude;
    }

    public String getLongitude(){
        return longitude;
    }

}
