package examples.android.captech.traveldestinationsapp.model;

import examples.android.captech.traveldestinationsapp.R;

public class AppModel {

    private DestinationModel[] destinations;

    public AppModel() {
        destinations = new DestinationModel[17];

        destinations[0] = new DestinationModel("Barcelona", "Spain", "Europe",
                "Spanish", "1,620,809", "101.4 km2", "16000 / km2", R.string.barcelona_description,
                new int[]{R.drawable.barcelona_1, R.drawable.barcelona_2, R.drawable.barcelona_3});

        destinations[1] = new DestinationModel("Cairo", "Egypt", "Africa",
                "Arabic", "19,500,000", "606 km2", "19376 / km2", R.string.cairo_description,
                new int[]{R.drawable.cairo_1, R.drawable.cairo_2, R.drawable.cairo_3});

        destinations[2] = new DestinationModel("Dubai", "United Arab Emirates", "Asia",
                "Arabic", "3,052,089", "4,114 km2", "408.18 / km2", R.string.dubai_description,
                new int[]{R.drawable.dubai_1, R.drawable.dubai_2, R.drawable.dubai_3});

        destinations[3] = new DestinationModel("London", "England", "Europe",
                "English", "8,787,892", "1,572 km2", "5,590 / km2", R.string.london_description,
                new int[]{R.drawable.london_1, R.drawable.london_2, R.drawable.london_3});

        destinations[4] = new DestinationModel("Machu Picchu", "Peru", "South America",
                "Spanish", "0", "325.92 km2", "0 / km2", R.string.machu_picchu_description,
                new int[]{R.drawable.machu_picchu_1, R.drawable.machu_picchu_2, R.drawable.machu_picchu_3});

        destinations[5] = new DestinationModel("Maldives", "United Arab Emirates", "Asia",
                "Arabic", "427,756", "298 km2", "1,102.50 / km2", R.string.maldives_description,
                new int[]{R.drawable.maldives_1, R.drawable.maldives_2, R.drawable.maldives_3});

        destinations[6] = new DestinationModel("New Delhi", "India", "Asia",
                "Hindi", "257,803", "42.7 km2", "6,000 / km2", R.string.new_delhi_description,
                new int[]{R.drawable.new_delhi_1, R.drawable.new_delhi_2, R.drawable.new_delhi_3});

        destinations[7] = new DestinationModel("Palawan", "Philippines", "Asia",
                "Tagalog", "849,469", "14,649.73 km2", "58 / km2", R.string.palawan_description,
                new int[]{R.drawable.palawan_1, R.drawable.palawan_2, R.drawable.palawan_3});

        destinations[8] = new DestinationModel("Paris", "France", "Europe",
                "French", "2,206,488", "105.4 km2", "21,000 / km2", R.string.paris_description,
                new int[]{R.drawable.paris_1, R.drawable.paris_2, R.drawable.paris_3});

        destinations[9] = new DestinationModel("Reykjavik", "Iceland", "Europe",
                "Icelandic", "126,100", "273 km2", "451.5 / km2", R.string.reykjavik_description,
                new int[]{R.drawable.reykjavik_1, R.drawable.reykjavik_2, R.drawable.reykjavik_3});

        destinations[10] = new DestinationModel("Rio De Janeiro", "Brazil", "South America",
                "Portugese", "12,280,702", "4,539.80 km2", "2,705.10 / km2", R.string.rio_de_janeiro_description,
                new int[]{R.drawable.rio_de_janeiro_1, R.drawable.rio_de_janeiro_2, R.drawable.rio_de_janeiro_3});

        destinations[11] = new DestinationModel("Rome", "Italy", "Europe",
                "Italian", "4,357,041", "1,285 km2", "2,236 / km2", R.string.rome_description,
                new int[]{R.drawable.rome_1, R.drawable.rome_2, R.drawable.rome_3});

        destinations[12] = new DestinationModel("Shanghai", "China", "Asia",
                "Chinese", "24,200,000", "6,341 km2", "2,059 / km2", R.string.shanghai_description,
                new int[]{R.drawable.shanghai_1, R.drawable.shanghai_2, R.drawable.shanghai_3});

        destinations[13] = new DestinationModel("Saint Petersburg", "Russia", "Europe",
                "Russian", "5,323,300", "1,439 km2", "3,708.4 / km2", R.string.saint_petersburg_description,
                new int[]{R.drawable.saint_petersburg_1, R.drawable.saint_petersburg_2, R.drawable.saint_petersburg_3});

        destinations[14] = new DestinationModel("Sydney", "Australia", "Australia",
                "English", "5,131,326", "12,367.70 km2", "415 / km2", R.string.sydney_description,
                new int[]{R.drawable.sydney_1, R.drawable.sydney_2, R.drawable.sydney_3});

        destinations[15] = new DestinationModel("Tokyo", "Japan", "Asia",
                "Japanese", "13,617,444", "2,187.66 km2", "6,224.66 / km2", R.string.tokyo_description,
                new int[]{R.drawable.tokyo_1, R.drawable.tokyo_2, R.drawable.tokyo_3});

        destinations[16] = new DestinationModel("Venice", "Italy", "Europe",
                "Italian", "264,557", "414.57 km2", "640 / km2", R.string.venice_description,
                new int[]{R.drawable.venice_1, R.drawable.venice_2, R.drawable.venice_3});
    }

    public DestinationModel[] getDestinatations() {
        return destinations;
    }

}
