const editModal = document.getElementById('ModalEdit')
editModal.addEventListener('show.bs.modal', event => {
    // Button that triggered the modal
    const button = event.relatedTarget
    // Extract info from data-bs-* attributes
    const userId = button.getAttribute('data-bs-userId')
    const userFirstname = button.getAttribute('data-bs-userFirstname')
    const userLastname = button.getAttribute('data-bs-userLastname')
    const userAge = button.getAttribute('data-bs-userAge')
    const userEmail = button.getAttribute('data-bs-userEmail')
    // Update the modal's content.

    const modaluserId = editModal.querySelector('#userId')
    const modaluserFirstname = editModal.querySelector('#userFirstname')
    const modaluserLastname = editModal.querySelector('#userLastname')
    const modaluserAge = editModal.querySelector('#userAge')
    const modaluserEmail = editModal.querySelector('#userEmail')

    modaluserId.value = userId
    modaluserFirstname.value = userFirstname
    modaluserLastname.value = userLastname
    modaluserAge.value = userAge
    modaluserEmail.value = userEmail

})