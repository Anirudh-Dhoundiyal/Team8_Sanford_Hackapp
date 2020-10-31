import java.util.*
internal object ExpandableListData {
    val data: HashMap<String, List<String>>
        get() {
            val expandableListDetail =
                HashMap<String, List<String>>()
            val medicationOnFile: MutableList<String> =
                ArrayList()
            medicationOnFile.add("Zanax")
            medicationOnFile.add("Exctasy")
            medicationOnFile.add("Acid")
            medicationOnFile.add("Doha")
            medicationOnFile.add("Medecinal Ganja")
            expandableListDetail["Prescriptions"] = medicationOnFile
           return expandableListDetail
        }
}