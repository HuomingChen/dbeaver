package org.jkiss.dbeaver.debug;

import java.util.Map;

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObject;

public interface DBGFinder {
    
    DBSObject findObject(Map<String, Object> context, Object identifier, DBRProgressMonitor monitor) throws DBException;

}
