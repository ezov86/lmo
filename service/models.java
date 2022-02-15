@Data
public class Prescription implements Serializable {
    // Уникальный идентификатор в АТОЛЛ.
    private long id;
    // Серия.
    private String series;
    // Номер.
    private String number;
    // Международное непатентованное наименование.
    private String mnn;
    // Торговое наименование.
    private String tradeName;
    // Da tales doses.
    private String dtd;
    // Signa.
    private String signa;
    // Дата выписки.
    private String orderDate;
    // Дней до окончания действия.
    private int daysCount;
    // статус (Active - активный, Released - отпущенный, Delayed - отложенный).
    private PrescriptionStatus status;
    // Имя аптекаря, отпустившего рецепт.
    private String pharmacistName;
    // Аптека, отпустившая рецепт.
    private String pharmacy;
    // Медицинская организация, выписавшая рецепт.
    private String organization;
    // Имя врача, выписавшего рецепт.
    private String doctor;
    // Продолжительность приёма.
    private String duration;
    // Количество приёмов в день.
    private String medicationsPerDay;
    // Дозировка.
    private String dose;
}

@Data
@AllArgsConstructor
public class HttpError {
    private int code;
    private String message;
}
