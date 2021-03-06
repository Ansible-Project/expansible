package io.expansible;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.bundles.assets.AssetsBundleConfiguration;
import io.dropwizard.bundles.assets.AssetsConfiguration;
import io.dropwizard.client.JerseyClientConfiguration;
import io.dropwizard.db.DataSourceFactory;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class ExpansibleConfiguration extends Configuration implements AssetsBundleConfiguration {

  @JsonProperty("swagger")
  public SwaggerBundleConfiguration swaggerBundleConfiguration;

  @JsonProperty("bootstrapHosts")
  public String bootstrapHosts;

  @Valid
  @NotNull
  @JsonProperty
  private final AssetsConfiguration assets = new AssetsConfiguration();

  @Valid
  @NotNull
  @JsonProperty
  private DataSourceFactory dataSource = new DataSourceFactory();

  @Valid
  @NotNull
  @JsonProperty
  private JerseyClientConfiguration client = new JerseyClientConfiguration();

  public DataSourceFactory getDataSource() {
    return dataSource;
  }

  public JerseyClientConfiguration getClient() {
    return client;
  }

  public AssetsConfiguration getAssetsConfiguration() {
    return assets;
  }

}
