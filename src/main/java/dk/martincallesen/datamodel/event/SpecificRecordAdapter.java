package dk.martincallesen.datamodel.event;

import org.apache.avro.Schema;
import org.apache.avro.specific.SpecificRecord;
import org.apache.avro.specific.SpecificRecordBase;

public class SpecificRecordAdapter extends SpecificRecordBase {
    private SpecificRecord specificRecord;

    public SpecificRecordAdapter(SpecificRecord specificRecord) {
        this.specificRecord = specificRecord;
    }

    @Override
    public void put(int i, Object o) {
        specificRecord.put(i, 0);
    }

    @Override
    public Object get(int i) {
        return specificRecord.get(i);
    }

    @Override
    public Schema getSchema() {
        return specificRecord.getSchema();
    }

    public Object getRecord(){
        return specificRecord;
    }
}
