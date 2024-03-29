package org.enes.constants;

public class RestApiUrl {
    private static final String VERSION = "/v1";
    private static final String API = "/api";
    private static final String TEST = "/test";
    private static final String DEV = "/dev";
    private static final String PROD = "/prod";
    private static final String ROOT = DEV+VERSION;

    public static final String DOKTOR = ROOT + "/doktor";
    public static final String HASTA = ROOT + "/hasta";
    public static final String HASTANE = ROOT + "/hastane";

    public static final String DOKTOR_SAVE = "/doktor-save";
    public static final String HASTA_SAVE = "/hasta-save";
    public static final String RANDEVU_SAVE = "/randevu-save";
    public static final String GET_ALL_RANDEVU = "/get-all-randevu";
    public static final String GET_ALL_DOKTOR = "/get-all-doktor";
    public static final String GET_ALL_HASTA = "/get-all-hasta";
    public static final String DELETE_DOKTOR = "/delete-doktor";
    public static final String GET_BY_ID_DOKTOR = "/get-by-id-doktor";
    public static final String GET_BY_ID_RANDEVU = "/get-by-id-randevu";
    public static final String GET_BY_TC_RANDEVU = "/get-by-tc-randevu";
    public static final String GET_BY_ID_HASTA = "/get-by-id-hasta";
    public static final String DELETE_RANDEVU = "/delete-by-randevu";
    public static final String DELETE_HASTA = "/delete-by-hasta";
    public static final String FIND_RANDEVU_BY_DOKTOR_ID = "/find-by-randevu-doktor-id";
}
