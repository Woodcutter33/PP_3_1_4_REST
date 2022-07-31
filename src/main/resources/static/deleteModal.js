const DeleteModal = document.getElementById('ModalDelete')
DeleteModal.addEventListener('show.bs.modal', event => {
    // Button that triggered the modal
    const Dbutton = event.relatedTarget
    // Extract info from data-bs-* attributes
    const DuserId = Dbutton.getAttribute('data-bs-userId')
    const DuserFirstName = Dbutton.getAttribute('data-bs-userFirstName')
    const DuserSurName = Dbutton.getAttribute('data-bs-userSurName')
    const DuserAge = Dbutton.getAttribute('data-bs-userAge')
    const DuserEmail = Dbutton.getAttribute('data-bs-userEmail')
    // Update the modal's content.

    const DmodaluserId = DeleteModal.querySelector('#userIdDelete')
    const DmodaluserFirstName = DeleteModal.querySelector('#userFirstNameDelete')
    const DmodaluserSurName = DeleteModal.querySelector('#userSurNameDelete')
    const DmodaluserAge = DeleteModal.querySelector('#userAgeDelete')
    const DmodaluserEmail = DeleteModal.querySelector('#userEmailDelete')

    DmodaluserId.value = DuserId
    DmodaluserFirstName.value = DuserFirstName
    DmodaluserSurName.value = DuserSurName
    DmodaluserAge.value = DuserAge
    DmodaluserEmail.value = DuserEmail

})