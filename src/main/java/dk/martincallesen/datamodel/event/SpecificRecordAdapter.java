package dk.martincallesen.datamodel.event;

import org.apache.avro.Schema;
import org.apache.avro.specific.SpecificRecord;
import org.apache.avro.specific.SpecificRecordBase;

public class SpecificRecordAdapter<T extends SpecificRecord> extends SpecificRecordBase {
    private T specificRecord;

    public SpecificRecordAdapter(T specificRecord) {
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

    public T getRecord(){
        return specificRecord;
    }
}
