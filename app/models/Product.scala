package models

import play.api.libs.json.Json

/**
 * Created by emmanuelhcpk on 15/10/15.
 */
class Product(
               var productName: String,
               var productType: Int,
               var productBalance: Double,
               var movements: List[Movement]
               )
{

  def toJson() = Json.obj(
    "productName" -> this.productName,
    "productType" -> this.productType,
    "ProductBalance" -> this.productBalance,
    "Movements"->Json.toJson(this.listToJson())


  )
  def listToJson()=
  {
    var arry = this.movements.map(x => x.toJson())
    arry
  }
}