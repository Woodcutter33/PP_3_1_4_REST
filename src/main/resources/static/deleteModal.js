const DeleteModal = document.getElementById('ModalDelete')
DeleteModal.addEventListener('show.bs.modal', event => {
    // Button that triggered the modal
    const Dbutton = event.relatedTarget
    // Extract info from data-bs-* attributes
    const DuserId = Dbutton.getAttribute('data-bs-userId')
    const DuserFirstname = Dbutton.getAttribute('data-bs-userFirstname')
    const DuserLastname = Dbutton.getAttribute('data-bs-userLastname')
    const DuserAge = Dbutton.getAttribute('data-bs-userAge')
    const DuserEmail = Dbutton.getAttribute('data-bs-userEmail')
    // Update the modal's content.

    const DmodaluserId = DeleteModal.querySelector('#userIdDelete')
    const DmodaluserFirstname = DeleteModal.querySelector('#userFirstnameDelete')
    const DmodaluserLastname = DeleteModal.querySelector('#userLastnameDelete')
    const DmodaluserAge = DeleteModal.querySelector('#userAgeDelete')
    const DmodaluserEmail = DeleteModal.querySelector('#userEmailDelete')

    DmodaluserId.value = DuserId
    DmodaluserFirstname.value = DuserFirstname
    DmodaluserLastname.value = DuserLastname
    DmodaluserAge.value = DuserAge
    DmodaluserEmail.value = DuserEmail

})