package dbconnector.dbconnector;


import javax.sql.DataSource;

/**
 * Data-source parser.
 * 
 * @author sfatehi
 */
public interface DatabaseConnector
{

  /**
   * Creates a new bundled data source from the bundled driver
   * properties.
   * 
   * @return Data source
   * @throws DatabaseConnectorException
   *         On an exception
   */
  DataSource createDataSource()
    throws DatabaseConnectorException;

  /**
   * Gets the name of the datasource.
   * 
   * @return Datasource name.
   */
  String getDataSourceName();

}
