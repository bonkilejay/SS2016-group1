package gse1.buergerbusserver.linemanagement.dataaccess.api.dao;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LineEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author razadfki
 *
 */
public interface LineDao extends ApplicationDao<LineEntity>, MasterDataDao<LineEntity> {

}
