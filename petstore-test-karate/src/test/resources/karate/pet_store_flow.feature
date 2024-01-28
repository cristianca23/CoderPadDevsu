
  Feature: add the information of the pet

    Background:
      * url urlBase
      * def bodyRequestAddPet = read('classpath:jsonrequest/add_pet.json')
      * def nameGenerator = Java.type("utils.NameGenerator")
       * def newName = nameGenerator.generatePetName()


    @AddPet
    Scenario: Add the general information of the pet
      * set bodyRequestAddPet.name = newName
      Given request bodyRequestAddPet
      When method POST
      Then status 200
      * match response.name == newName
      * match response.status == "available"
      * match response.category.id == '#number'

    Scenario: Find the Pet by the unique ID
      * def AddPet = call read('@AddPet')
      * def idPet = AddPet.response.id
      * def namePet = AddPet.response.name
      Given path '/' + idPet
      When method GET
      Then status 200
      * assert response.status == "available"
      * assert response.name == namePet
      * assert response.id == idPet

    @statusPet
    Scenario: Update pet name and status
      * def bodyRequestUpdateName = read('classpath:jsonrequest/update_name_status.json')
      * def AddPet = call read('pet_store_flow.feature@AddPet')
      * def idPet = AddPet.response.id
      * set bodyRequestUpdateName.name = newName
      * set bodyRequestUpdateName.status = "sold"
      * set bodyRequestUpdateName.id = idPet
      Given request bodyRequestUpdateName
      When method PUT
      Then status 200
      * match response.status == "sold"
      * match response.name == bodyRequestUpdateName.name
      * match response.id == idPet

    Scenario: Find the pet by status
      * def status = call read('pet_store_flow.feature@statusPet')
      * def idPet = status.response.id
      * def namePet = status.response.name
      * params {status:sold}
      Given path '/findByStatus'
      When method GET
      Then status 200
      * def pet = karate.jsonPath(response, "$.[*][?(@.id=='" + idPet + "')]")
      * match pet[0].name == namePet
      * match pet[0].id == idPet
      * match pet[0].status == "sold"


